import turtle
import random
turtle.pensize(5)
lines = random.randint(50, 200)
for i in range(0, lines):
    length = random.randint(25, 100)
    rotate = random.randint(1, 365)
    turtle.forward(length)
    turtle.right(rotate)

turtle.exitonclick()