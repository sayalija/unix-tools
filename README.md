Unix Tools
====================
This repository simulates the unix-tools like `wc, cut, head, tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

##### wc :
* Short for word count, wc displays a count of lines, words, and characters in a file.

```
sj_wc.sh filename.txt
```

##### cut :
* Remove or "cut out" sections of each line of a file.

```
sj_cut.sh filename.txt -fieldNo [delimiter]
```

##### head:
* Head makes it easy to output the first part of file contains first `n` lines.

```
sj_head.sh filename.txt
```
OR

```
sj_head.sh -noOfLines filename.txt
```

##### tail:
* Delivers the last part of the file contains last `n` lines.

```
sj_tail.sh filename.txt
```
OR

```
sj_tail.sh -noOfLines filename.txt
```

##### sort:
* Sorts the lines in a file.

```
sj_sort.sh filename.txt
```

##### uniq:
* Report or filter out repeated lines in a file.

```
sj_uniq.sh filename.txt
```

##### reduceSpaces:
* Reduces more than one occurence of blank spaces into 1.

```
sj_reduceSpaces.sh filename.txt
```