# Act 4.14 triangle problem using function
from turtle import *

def draw_triangle(length):
    """ Draw an equilateral triangle"""
    for sides in range(0,3):
        forward(length)
        left(120)

# Draw first triangle
draw_triangle(60)

# Move to position for second triangle
penup()
forward(100)
pendown()

# Draw second triangle
draw_triangle(70)

# Move to position for third triangle
penup()
left(180)
forward(100)
right(90)
forward(100)
right(90)
pendown()

# Draw third triangle
draw_triangle(80)
