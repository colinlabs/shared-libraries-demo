def call(repo){
    def jenkinsfilename = "jenkinsfile"
    def jenkinsfile = libraryResource(jenkinsfilename)

    pipeLog.info("Load Jenkinsfile from remote...")
    
    env.GIT_REPO = repo

    node() {
        writeFile file: jenkinsfilename, text: jenkinsfile
        load(jenkinsfilename)
    }
}

// pipeTrigger("http://host.docker.internal:3000/root/shell-project.git")