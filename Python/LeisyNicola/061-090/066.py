import turtle
import random
turtle.pensize(10)
for i in range(0, 16):
    turtle.color(random.choice(['red', 'blue', 'yellow', 'green', 'pink', 'orange']))
    turtle.forward(50)
    turtle.right(22.5)

turtle.exitonclick()