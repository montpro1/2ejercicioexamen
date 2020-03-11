
    public void cloneRep() {
        String login = "userid";
        String password = "password";
        String rep = "repository";
        String localDir = "/home/myuser/repository/";
        try {
            System.out.println("Connecting...." + login + " : " + password);
            GitHub gitHub = GitHub.connectUsingPassword(login, password);
            boolean isValid = gitHub.isCredentialValid();
            System.out.println("is Valid ? " + isValid);
            if (isValid) {
                GHRepository repository = gitHub.getRepository(rep);
                //how to clone the repository to local directory?
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION....");
            e.printStackTrace();
        }
    }
}
