#!groovy

def createRelease(tag, branch, description, draft, prerelease) {
    def url = new URL("https://api.github.com/repos/voyages-sncf-technologies/hesperides/releases")
    def conn = url.openConnection()
    // Set the connection verb and headers
    conn.setRequestMethod("POST")
    conn.setRequestProperty("Content-Type", "application/json")
    // Required to send the request body of our POST
    conn.doOutput = true

    // Create our JSON Authentication string
    def input = "{\"tag_name\": \"${tag}\", \"target_commitish\": \"${branch}\", \"name\": \"${tag}\", \"body\": \"${description}\"," +
            "\"draft\": ${draft}, \"prerelease\": ${prerelease}}"

    // Send our request
    def writer = new OutputStreamWriter(conn.outputStream)
    writer.write(input)
    writer.flush()
    writer.close()
    conn.connect()

    // Parse and return the token
    def result = parseJSON(conn.content.text)
    return result.token
}

return this
