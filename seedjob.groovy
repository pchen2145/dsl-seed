// dsl_seed_project.groovy

def gitUrl = "https://github.com/pchen2145/seed-dsl.git"

job("Pipeline_1") {
    description "Pipeline_1"
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                url gitUrl
                branch "origin/master"
            }
            extensions {
                wipeOutWorkspace()
                localBranch "master"
            }
        }
    }
    steps {
        shell "I'm building master!"
    }
}
