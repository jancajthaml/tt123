#!/usr/bin/python

import sys
import re
import numpy
from operator import itemgetter

buffer = []

for line in sys.stdin:
  buffer.extend(re.split('[\s|,|.]+', line))

words, counts = numpy.unique(buffer, return_counts=True)

for k, v in zip(words, counts):
  if k == '':
    continue
  print('{0} {1}'.format(v,k))
