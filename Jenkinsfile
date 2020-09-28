pipeline {
    agent  any 
    stages {
        stage('build') {
            steps {
                sh 'echo hello world'
                script {
                    
                    simple.info 'Starting'
                    simple.warning 'Nothing to do!'
                    werbung.anzeige 'Hier koennte Ihre Werbung stehen'
                    lysori.info 
                }    
            }
        }

        stage('manuela') {
            steps {
                sh 'echo hello world'
                script {
                    manuela.frage 'Was machen wir heute Abend?'
                }    
            }
        }

        stage('lysori') {
            steps {
                sh 'echo hello lysori'
                script {
                    lysori.warning 'die selbstzerstörung wird eingeleitet'
                }    
            }
        }

    }
}
