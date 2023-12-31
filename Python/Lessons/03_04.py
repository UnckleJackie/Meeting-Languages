import module01
print(module01.max1(15, 9))

from module01 import max1
print(max1(5, 9))

from module01 import *
print(max(10, 9))

import module01 as m01
print(m01.max1(16, 241))
