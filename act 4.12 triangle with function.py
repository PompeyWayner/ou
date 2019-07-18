# Act 4.12 triangle problem using function
from turtle import *

def draw_triangle():
    """ Draw an equilateral triangle with sides of 40 units"""
    for sides in range(0,3):
        forward(40)
        left(120)

# Draw first triangle
draw_triangle()

# Move to position for second triangle
penup()
forward(100)
pendown()

# Draw second triangle
draw_triangle()

# Move to position for third triangle
penup()
left(180)
forward(100)
right(90)
forward(100)
right(90)
pendown()

# Draw third triangle
draw_triangle()
