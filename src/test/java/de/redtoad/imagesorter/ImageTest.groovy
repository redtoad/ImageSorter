package de.redtoad.imagesorter

import org.junit.Test

class ImageTest extends GroovyTestCase {
    void setUp() {
        super.setUp()

    }

    void tearDown() {

    }

    void testCreateWithInvalidPathFails() {
        shouldFail(IOException) {
            new Image("") // empty path
        }
    }
}
