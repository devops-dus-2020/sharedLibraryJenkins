

pipeline {
    agent  any 
    stages {
        stage('build') {
            steps {
                sh 'echo hello world'
                script {
                    simple.info 'Starting'
                    simple.warning 'Nothing to do!'
                    sd-calc.example
                    werbung.anzeige 'Hier koennte Ihre Werbung stehen'
                }    
            }
        }

        stage('manuela') {
            steps {
                sh 'echo hello world'
                script {
                    manuela.frage 'Was machen wir heute Abend?'
                    karina.antwort 'Wir gucken Netflix :)'
                }    
            }
        }

    }
}
