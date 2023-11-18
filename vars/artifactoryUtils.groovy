def call(Map config) {
    def serverId = config.serverId ?: 'Artifactory' // Set this to the configured server ID in Jenkins
    def spec = config.spec ?: '{"files": []}' // Default empty spec, change accordingly
    def buildName = config.buildName ?: 'default-build-name' // Default build name, change accordingly
    def buildNumber = config.buildNumber ?: 'default-build-number' // Default build number, change accordingly

    echo "Uploading artifacts to Artifactory..."
    artifactoryUpload(
        serverId: serverId,
        spec: spec,
        buildName: buildName,
        buildNumber: buildNumber
    )
}