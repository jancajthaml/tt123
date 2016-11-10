#!/usr/bin/python

import sys

words = []
lines = sys.stdin.readlines()

for i in xrange(len(lines)):
  words.extend(lines[i].replace('\n','').split(' '))

counter = { key: 0 for key in set(words) }

for x in words:
  counter[x] += 1

for k, v in counter.items():
  print k, v
