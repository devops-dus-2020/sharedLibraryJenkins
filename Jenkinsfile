

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
        stage('lauri') {
            steps {
                sh 'echo hello world'
                script {
                    laura.warning 'Achtung. Ich komme.'
                    laura.info 'Hiermit bestätige ich die Ankunft.'
                }    
            }
        }
    }
}
