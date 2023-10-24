This small project is related to https://github.com/johnrengelman/shadow/issues/877

If you use the shadow plugin with a version less than 8 gradle shadowJar  will fail during relocation

If you use the shadow plugin with 8.1.1 (tested) the fat jar is properly built.

To test - gradle clean shadowJar choosing the desired shadow plugin version (inside build.gradle) 