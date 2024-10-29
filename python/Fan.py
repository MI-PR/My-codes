from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math
# Global variable for the rotation angle
angle = 0

# Function to draw a circle
def draw_circle(radius, num_segments):
    glBegin(GL_TRIANGLE_FAN)
    glColor3f(0.0, 0.0, 1.0)  # Blue color for the circle
    glVertex2f(0, 0)  # Center of the circle
    for i in range(num_segments + 1):
        theta = 2.0 * math.pi * i / num_segments  # Angle
        x = radius * math.cos(theta)  # X coordinate
        y = radius * math.sin(theta)  # Y coordinate
        glVertex2f(x, y)  # Vertex
    glEnd()

# Define the fan blade vertices
def fan_blade():
    glBegin(GL_TRIANGLES)
    glColor3f(1, 0, 0)  # Red color for the blade
    glVertex2f(0, 0)    # Center of the fan
    glVertex2f(0.1, 0.5)  # Top vertex of the blade
    glVertex2f(-0.1, 0.5) # Bottom vertex of the blade
    glEnd()

# Function to draw the fan
def draw_fan():
    global angle
    glPushMatrix()
    glRotatef(angle, 0, 0, 1)  # Rotate around the Z-axis
    for i in range(4):  # Draw 4 blades
        glPushMatrix()
        glRotatef(i * 90, 0, 0, 1)  # Rotate each blade
        fan_blade()
        glPopMatrix()
    glPopMatrix()

    # Draw the circle in the center
    draw_circle(0.1, 100)  # Draw a circle with radius 0.1 and 100 segments

# Display callback function
def display():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)  # Clear the screen
    draw_fan()  # Draw the fan
    glutSwapBuffers()  # Swap the buffers to display the result

# Timer function to update the angle and redraw
def timer(value):
    global angle
    angle += 2  # Increment the angle for rotation
    if angle >= 360:  # Reset angle after a full rotation
        angle = 0
    glutPostRedisplay()  # Request a redraw
    glutTimerFunc(30, timer, 0)  # Call this function again after 30 ms

# Initialize OpenGL
def init():
    glClearColor(0.0, 0.0, 0.0, 1.0)  # Set background color to black
    glColor3f(1.0, 1.0, 1.0)  # Set drawing color to white
    glPointSize(5)  # Set point size
    glLineWidth(2)  # Set line width
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    gluOrtho2D(-1, 1, -1, 1)  # Set the orthographic projection

# Main function
def main():
    glutInit(sys.argv)  # Initialize GLUT
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH)  # Set display mode
    glutInitWindowSize(800, 600)  # Set window size
    glutCreateWindow('Rotating Fan with Circle')  # Create window with title
    init()  # Initialize OpenGL settings
    glutDisplayFunc(display)  # Register display callback
    glutTimerFunc(0, timer, 0)  # Start the timer
    glutMainLoop()  # Enter the GLUT event processing loop


main()
