docker run --rm -v "%CD%":/home/groovy/scripts -w /home/groovy/scripts/src groovy ^
groovy test/johannes/FarmTest.groovy