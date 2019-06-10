import java.io.IOException;

public interface TextIO<S1, S2>{
    void find(S1 s1) throws IOException;
    void replace(S1 s1, S2 s2) throws IOException;
}
