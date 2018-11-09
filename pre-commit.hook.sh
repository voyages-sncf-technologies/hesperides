#!/bin/bash
# Script permettant de valider les fichiers Jenkinsfile avant commit
set -o pipefail -o errexit -o nounset

EXISTING_SUCESSFUL_JOB_URL=https://master.jenkins.cloud.socrate.vsct.fr/job/A_HESPERIDES/job/continuous-delivery/job/build_docker_image/617
JENKINS_AUTH=lucas_cimon:11257f1b1658aff86b5e68ce63741ec0cb  # created: 2018-11-09

validate_jenkinsfile () {
    local response=$(curl --silent --insecure $EXISTING_SUCESSFUL_JOB_URL/replay/checkScriptCompile --user $JENKINS_AUTH --data-urlencode value@$1)
    if [ $? -ne 0 ]; then
        echo "Command failed: curl --insecure $EXISTING_SUCESSFUL_JOB_URL/replay/checkScriptCompile --user $JENKINS_AUTH --data-urlencode value@$1" >&2
        exit 1
    fi
    ! echo $response | grep -F "\"status\":\"fail\""
}

return_value=0
for modified_file in $(git diff --cached HEAD --name-only); do
	if [[ $modified_file == Jenkinsfile* ]]; then
        if ! validate_jenkinsfile $modified_file; then
            echo "WARNING ! $modified_file is INVALID -> COMMIT CANCELED !"
            return_value=1
        fi
    fi
done
exit $return_value
