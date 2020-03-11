import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;


public class Repo {
    public static void main(String[] args) throws IOException {
        //GitHub github = GitHub.connect();

        GitHub github = new GitHubBuilder().withPassword("montpro1", "********").build();
        GHRepository repo = github.createRepository(
                "inicio de plugin23", "this is my new repository2",
                "https://github.com/montpro1", true/*public*/);
//kensuke


    }

}
