<h2>Motivtion</h2>
This repo is the attempt to make the scala koans from the Scala Koans Repository from Dick Wall 
<a href="http://bitbucket.org/dickwall/scala-koans/wiki/Home">Dick Wall's Scala Koans Repository</a> runnable on Scala 2.12. and sbt 0.13.15 again.

<h2>Language Evolution</h2>
Because the language evolved some things got deprecated like the 
<ul>
<li>Octal literals</li>
<li>removal of the old project plugins for sbteclipsify</li>
<li>use of the erasure method (which had been replaced by runtimeClass)</li>
<li>type missmatches for the KoanSuite for the runTest(s) method which now uses Args</li>
</ul>

<h2>Prerequisites</h2>
<a href="http://www.scala-sbt.org/index.html">sbt</a> installed on your computer (I did run sbt 0.13.15)

<h2>Run</h2>
Clone or download the repository and run <br/><b>$ sbt enlightMe</b>
<br/> 
This will start the Koans and stop after running them for change in files.
<br/>(englightMe is a custom command added in build.sbt)


<h2>IDE</h2>
Personally this did also run in idea, (generated via gen-idea) configured on my Macbook.

<h2>Update</h2>
Now and then I will have a look if the koans will still work with the current Scala Version.


<h2>License</h2>
The Scala Koans are licensed as Creative Commons -- NonCommercial. http://creativecommons.org/licenses/by-nc-sa/3.0/