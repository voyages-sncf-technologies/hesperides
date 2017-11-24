pipeline {
    agent any
    stages {
        stage('PUPPET') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    sh 'ssh deadbabyboy-bck "sudo /usr/bin/puppet agent -t --certname deadbabyboy.socrate.vsct.fr-stagging"'
                }
            }
        }
        stage('BOOT') {
            steps {
                sshagent(['2583bb80-8a00-4461-8b13-3a4fe8931855']) {
                    sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/BOOT"'
                }
            }
        }
    }
}