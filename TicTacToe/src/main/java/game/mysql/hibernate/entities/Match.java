package game.mysql.hibernate.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "game_match_hibernate", catalog = "tictactoe",  uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME")})
public class Match {

    private String name;

    private Integer victory;

    private Integer loss;

    private Integer draw;

    public Match() {
    }

    public Match(String name, Integer victory, Integer loss, Integer draw) {
        this.name = name;
        this.victory = victory;
        this.loss = loss;
        this.draw = draw;
    }

    @Id
    @Column(name = "NAME", length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "VICTORY", length = 11)
    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    @Column(name = "LOSS", length = 11)
    public Integer getLoss() {
        return loss;
    }

    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    @Column(name = "DRAW", length = 11)
    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return Objects.equals(name, match.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
