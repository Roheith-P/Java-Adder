print("Made By Roheith.")
exp = input("Input your expression: ")
try:
  value = eval(exp)
  print("The value of the expression is :")
  print(value)
  end = input("Press Enter to End")
except:
    print("There Was a error. You have Entered a letter or variable.Do not use variables")
    errwait = input("Press Enter To continue")


