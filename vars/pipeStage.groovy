def call(name, Closure body) {
    try {
        stage(name) {
            body()
        }
    } catch (Exception e) {
        currentBuild.result = "FAILURE"
        error(e)
    }   
}