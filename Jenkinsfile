

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
    }
}
