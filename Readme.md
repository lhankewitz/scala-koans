MOTIVATION<p/>
This repo is the attempt to make the scala koans from the Scala Koans Repository from Dick Wall 
<a href="http://bitbucket.org/dickwall/scala-koans/wiki/Home">Dick Wall's Scala Koans Repository</a> runnable on Scala 2.12. and sbt 0.13.15 again.

LANGUAGE EVOLUTION<p/>
Because the language evolved some things got deprecated like the 
<ul>
<li>Octal literals</li>
<li>removal of the old project plugins for sbteclipsify</li>
<li>use of the erasure method (which had been replaced by runtimeClass)</li>
<li>type missmatches for the KoanSuite for the runTest(s) method which now uses Args</li>
</ul>

PREREQUISITES<p/>
sbt installed on your computer (I did run sbt 0.13.15)

RUN<p/>
Clone or download the repository and run <br/><b>$ sbt test</b>
<br/> 


IDE<p/>
Personally this did also run in idea, (generated via gen-idea) configured on my Macbook.

UPDATE<p/>
Now and then I will have a look if the koans will still work with the current Scala Version.


LICENSE<p/>
The Scala Koans are licensed as Creative Commons -- NonCommercial. http://creativecommons.org/licenses/by-nc-sa/3.0/