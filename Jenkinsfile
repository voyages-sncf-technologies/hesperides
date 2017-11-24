pipeline {
    agent any
    stages {
        stage('SHUT') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    sh '/appl/washesa3/SHUT'
                }
            }
        }
    }
}