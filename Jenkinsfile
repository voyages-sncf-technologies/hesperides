pipeline {
    agent none
    node {
    stages {
        stage('SHUT') {
            steps {
                sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/SHUT"'
            }
        }
        stage('puppet') {
            steps {
                sh 'ssh uslrdku1@deadbabyboy-bck "sudo /usr/bin/puppet agent -t --certname deadbabyboy.socrate.vsct.fr-stagging"'
            }
        }
        stage('BOOT') {
            steps {
                sh 'ssh washesa3@deadbabyboy-bck "/appl/washesa3/BOOT"'
            }
        }
    }
}