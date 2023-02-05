def call(Map config) {
    node {
        git url: "https://github.com/kasturenishant/Jenkins-Terraform.git" 
        sh 'mkdir test'
    }
}