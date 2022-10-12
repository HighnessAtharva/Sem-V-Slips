from tkinter import *

win = Tk() # TCreate a basic window
win.geometry("312x324")  # Size of the window 
win.resizable(0, 0)  # Prevent from resizing the window
win.title("Calculator")


def btn_click(item):
    global expression
    expression = expression + str(item)
    input_text.set(expression)


def bt_clear(): 
    global expression 
    expression = "" 
    input_text.set("")
 

def bt_equal():
    global expression
    result = str(eval(expression)) 
    # 'eval': Evaluates the string expression directly
    input_text.set(result)
    expression = ""
 
expression = ""
input_text = StringVar()
 
 
input_frame = Frame(win, width=312, height=50, bd=0, highlightbackground="grey", highlightcolor="grey", highlightthickness=2)
 
input_frame.pack(side=TOP)
 
 
input_field = Entry(input_frame, font=('arial', 18, 'bold'), textvariable=input_text, width=50, bg="#c7dcff", bd=0, justify=RIGHT)
 
input_field.grid(row=0, column=0)
 
input_field.pack(ipady=10) 

 
button_fr = Frame(win, width=312, height=272.5, bg="grey")
 
button_fr.pack()
 
# row 1
 
clear = Button(button_fr, text = "C", fg = "grey", width = 32, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: bt_clear()).grid(row = 0, column = 0, columnspan = 3, padx = 1, pady = 1)
 
divide = Button(button_fr, text = "/", fg = "grey", width = 10, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: btn_click("/")).grid(row = 0, column = 3, padx = 1, pady = 1)
 
# row 2
 
seven = Button(button_fr, text = "7", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(7)).grid(row = 1, column = 0, padx = 1, pady = 1)
 
eight = Button(button_fr, text = "8", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(8)).grid(row = 1, column = 1, padx = 1, pady = 1)
 
nine = Button(button_fr, text = "9", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(9)).grid(row = 1, column = 2, padx = 1, pady = 1)
 
multiply = Button(button_fr, text = "*", fg = "grey", width = 10, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: btn_click("*")).grid(row = 1, column = 3, padx = 1, pady = 1)
 
#   row 3
 
four = Button(button_fr, text = "4", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(4)).grid(row = 2, column = 0, padx = 1, pady = 1)
 
five = Button(button_fr, text = "5", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(5)).grid(row = 2, column = 1, padx = 1, pady = 1)
 
six = Button(button_fr, text = "6", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(6)).grid(row = 2, column = 2, padx = 1, pady = 1)
 
minus = Button(button_fr, text = "-", fg = "grey", width = 10, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: btn_click("-")).grid(row = 2, column = 3, padx = 1, pady = 1)
 
# row 4
 
one = Button(button_fr, text = "1", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(1)).grid(row = 3, column = 0, padx = 1, pady = 1)
 
two = Button(button_fr, text = "2", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(2)).grid(row = 3, column = 1, padx = 1, pady = 1)
 
three = Button(button_fr, text = "3", fg = "grey", width = 10, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(3)).grid(row = 3, column = 2, padx = 1, pady = 1)
 
plus = Button(button_fr, text = "+", fg = "grey", width = 10, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: btn_click("+")).grid(row = 3, column = 3, padx = 1, pady = 1)
 
# row 4
 
zero = Button(button_fr, text = "0", fg = "grey", width = 21, height = 3, bd = 0, bg = "#80afff", cursor = "hand2", command = lambda: btn_click(0)).grid(row = 4, column = 0, columnspan = 2, padx = 1, pady = 1)
 
point = Button(button_fr, text = ".", fg = "grey", width = 10, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: btn_click(".")).grid(row = 4, column = 2, padx = 1, pady = 1)
 
equals = Button(button_fr, text = "=", fg = "grey", width = 10, height = 3, bd = 0, bg = "#c7dcff", cursor = "hand2", command = lambda: bt_equal()).grid(row = 4, column = 3, padx = 1, pady = 1)
 
win.mainloop()