**Lecture 2: Exercise 1** (From ReExam F18 CamelWriter)

**Main topics:**
- File I/O
- Operations on text strings and characters
- Exception Handling

**Provided files:**
- DryLips.txt: lyrics by Dúné
- OhLand.txt: Lyrics by Oh-Land
- MaryAnn.txt: Lyrics by Volbeat
- camelwriter.CamelWriter.java: Code skeleton that can be used as a starting point.

In this assignment, a java program will be developed that takes a text file as input and converts each line into one word, written in camel script following the convention of java methods and variables:

- The first word in the line is written in lower case
- Subsequent words are capitalized
- The words are put together without spaces
- When a line is converted to a word in camel script, it is written to the textfile

Example: first verse of Dúné's Dry Lips before and after conversion:

![](/images/output.png)

**Hint:**

* Use a Scanner to read the input file one line at a time.
* Use split(" ") on the line so that each word is now in a String array
* Convert the 1st word to lower case and the first letter of the rest of the words to upper case
* Assemble the line words into one long word in camel script and print it.
* Write the converted output to a text file.