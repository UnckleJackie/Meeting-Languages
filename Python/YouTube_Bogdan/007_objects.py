'''There are exist Mutable and Immutable objects in Python.
Immutable objects - Strings, Boolean, Int, Float, tuple, None, range.
Mutable objects - List, Dict, Set, user-defined classes.'''

my_number = 10
print(id(my_number))  # 140716966922968
my_string = 'abc'
print(id(my_string))  # 140716965836608
pther_number = my_number
print(id(pther_number))  # 140716966922968

# Strings
my_name = 'Jesus'
print(my_name)  # Jesus

greeting = 'Hello from Python!'
print(greeting)  # Hello from Python!
print(type(my_name))  # <class 'str'>
print(id(my_name))  # 2738265611056

info_msg = """You are learning the
easiest programming language - Python!"""
print(type(info_msg))  # <class 'str'>
print(id(info_msg))  # 2520066986416
print(info_msg)  # You are learning the easiest programming language - Python!

long_str = "This is a very long string"
print(long_str)  # This is a very long string
print(type(long_str))  # <class 'str'>
print(type(int))  # <class 'type'>

long_str = """This is
            a very
            long
            string"""

my_name = 'Jesus'
print(len(my_name))  # 5 - length of string
print(my_name[0])  # J
print(my_name[3:5])  # us

my_comment = "This is my short comment"

print(len(my_comment))  # 24
print(my_comment.replace('short', 'long new'))  # This is my long new comment
print(my_comment)  # This is my short comment

print(my_comment.count(' '))  # 4 (spaces in the string)
print(my_comment.count('is'))  # 2
print(my_comment[-1])  # t
print(my_comment[2:7])  #  is is
print(my_comment[:10])  # This is my
print(my_comment[10:])  #  short comment
print(my_comment[::2])  # Ti sm hr omn



