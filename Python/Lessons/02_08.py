# Операции с множествами
a = {1, 2, 3, 5, 8}
b = {2, 5, 8, 13, 21}
c = a.copy()            # {1, 2, 3, 5, 8}
print(c)
u = a.union(b)          # {1, 2, 3, 5, 8, 13, 21}
print(u)
i = a.difference(b)     # {1, 3}
print(i)
di = a.difference(a)    # set()
print(di)
dr = b.difference(a)    # {13, 21}
print(dr)
q = a.union(b).difference(a.intersection(b))  # {1, 21, 3, 13}
print(q)