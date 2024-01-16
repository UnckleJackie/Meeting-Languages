school_subject_list = (['maths', 'english', 'history', 'chemistry', 'russian', 'informathics'])
print(school_subject_list)
dislike = input('Which of these subjects do you dislike? ')
getrid = school_subject_list.index(dislike)
del school_subject_list[getrid]
print(school_subject_list)