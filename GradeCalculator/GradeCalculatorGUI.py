from tkinter import *       # Imports tkinter package



class GradeCalc(Tk):        # Grade Calculator Class. tkinter is inherited

    def __init__(self, master=None):        # Initializer of the GradeCalc class
        Tk.__init__(self)
        self.master = master

        self.headerFont = ("Helvetica", "12", "bold italic")    # Fonts for various areas in the GUI
        self.calculateFont = ("Helvetica", "18", "bold")
        self.finalFont = ("Helvetica", "24", "bold")
        self.finalLetterFont = ("Helvetica", "48", "bold")
        self.directionsFont = ("Times New Roman", "10", "italic")

        self.examNumber = 1     # Each section is assigned a number to keep track and label how many there are
        self.assignmentNumber = 1
        self.labNumber = 1
        self.essayNumber = 1
        self.quizNumber = 1
        self.finalExamNumber = 1

        self.examList = []      # Each section stores its contents in a list
        self.assignmentList = []
        self.labList = []
        self.essayList = []
        self.quizList = []
        self.finalExamList = []

        self.examWeight = 0     # Each section has a weight, based on it's importance to the overall class score
        self.assignmentWeight = 0
        self.labWeight = 0
        self.essayWeight = 0
        self.quizWeight = 0
        self.finalExamWeight = 0

        self.something = 0.0        # A variable that is later used to averages can be stored and recalculated

        self.CreateHeadings()       # Calls the CreateHeadings function, which creates many of the main parts of the GUI

        self.gradeScale = self.CreateGradeScale()   # Calls the CreateGradeScale function which reates the grade scale for the class

        self.directionsPopUp()  # Calls the function that shows the directions on top of the grade calculator


    def CreateHeadings(self):       # Creates the main parts of the grade calculator GUI including the section headings and labels
        examTitleLabel = Label(self, text='Exams', font=self.headerFont)
        examTitleLabel.grid(row=0, column=0, columnspan=2)  # Exam Section Title
        Label(self, text="Exam Weight").grid(row=1, column=0)  # Exam weight label
        self.examWeight = Entry(self)  # Exam weight entry box
        self.examWeight.insert(0, 0)    # Default value of 0
        self.examWeight.grid(row=1, column=1)
        self.btnAddExam = Button(self, text="Add Exam", command=self.addExam)  # Add exam button
        self.btnAddExam.grid(row=1, column=3, padx=(0, 50))
        Label(self, text="Exam Title").grid(row=3, column=0)  # Exam column title
        Label(self, text="Score (Out of 100)").grid(row=3, column=1)  # Score column title

        assignmentTitleLabel = Label(self, text='Assignments', font=self.headerFont)  # Assignment Section Title
        assignmentTitleLabel.grid(row=0, column=4, columnspan=2)
        Label(self, text="Assignment Weight").grid(row=1, column=4)  # Assignment weight label
        self.assignmentWeight = Entry(self)  # Assignment weight entry box
        self.assignmentWeight.grid(row=1, column=5)
        self.assignmentWeight.insert(0, 0) # Default value of 0
        self.btnAddAssignment = Button(self, text="Add Assignment", command=self.addAssignment)  # Add assignment button
        self.btnAddAssignment.grid(row=1, column=7, padx=(0, 50))
        Label(self, text="Assignment Title").grid(row=3, column=4)  # Assignment column title
        Label(self, text="Score (Out of 100)").grid(row=3, column=5)  # Score column title

        labTitleLabel = Label(self, text='Labs', font=self.headerFont)  # Lab Section Title
        labTitleLabel.grid(row=0, column=8, columnspan=2)
        Label(self, text="Lab Weight").grid(row=1, column=8)  # Lab weight label
        self.labWeight = Entry(self)  # Lab weight entry box
        self.labWeight.grid(row=1, column=9)
        self.labWeight.insert(0, 0)     # Default value of 0
        self.btnAddLab = Button(self, text="Add Lab", command=self.addLab)  # Add lab button
        self.btnAddLab.grid(row=1, column=11, padx=(0, 20))
        Label(self, text="Lab Title").grid(row=3, column=8)  # Lab column title
        Label(self, text="Score (Out of 100)").grid(row=3, column=9)  # Lab column title

        essayTitleLabel = Label(self, text='Essays', font=self.headerFont)  # Essay Section Title
        essayTitleLabel.grid(row=20, column=8, columnspan=2, pady=(50, 0))
        Label(self, text="Essay Weight").grid(row=21, column=8)  # Essay weight label
        self.essayWeight = Entry(self)  # Lab weight entry box
        self.essayWeight.grid(row=21, column=9)
        self.essayWeight.insert(0, 0)       # Default value of 0
        self.btnAddEssay = Button(self, text="Add Essay", command=self.addEssay)  # Add essay button
        self.btnAddEssay.grid(row=21, column=11, padx=(0, 20))
        Label(self, text="Essay Title").grid(row=22, column=8)  # Essay column title
        Label(self, text="Score (Out of 100)").grid(row=22, column=9)  # Essay column title

        quizTitleLabel = Label(self, text='Quizzes', font=self.headerFont) # Quiz Section Title
        quizTitleLabel.grid(row=20, column=0, columnspan=2, pady=(50, 0))
        Label(self, text="Quiz Weight").grid(row=21, column=0)  # Quiz weight label
        self.quizWeight = Entry(self)  # Quiz weight entry box
        self.quizWeight.grid(row=21, column=1)
        self.quizWeight.insert(0, 0)        # Default value of 0
        self.btnAddQuiz = Button(self, text="Add Quiz", command=self.addQuiz)  # Add quiz button
        self.btnAddQuiz.grid(row=21, column=3, padx=(0, 20))
        Label(self, text="Quiz Title").grid(row=22, column=0)  # Quiz column title
        Label(self, text="Score (Out of 100)").grid(row=22, column=1)  # Score column title

        finalExamTitleLabel = Label(self, text='Final Exam', font=self.headerFont)  # Final Exam Section Title
        finalExamTitleLabel.grid(row=20, column=4, columnspan=2, pady=(50, 0))
        Label(self, text="Final Exam Weight").grid(row=21, column=4)  # Final Exam weight label
        self.finalExamWeight = Entry(self)  # Final Exam weight entry box
        self.finalExamWeight.grid(row=21, column=5)
        self.finalExamWeight.insert(0, 0)       # Default value of 0
        self.btnAddFinalExam = Button(self, text="Add Final Exam", command=self.addFinalExam)  # Add final exam button
        self.btnAddFinalExam.grid(row=21, column=7, padx=(0, 20))
        Label(self, text="Final Exam Title").grid(row=22, column=4)  # Final Exam column title
        Label(self, text="Score (Out of 100)").grid(row=22, column=5)  # Score column title

        finalGradeTitleLabel = Label(self, text="Final Grade", font=self.headerFont)        # A label that says "Final Grade"
        finalGradeTitleLabel.grid(row=20, column=15, columnspan=2)

        self.calculateClassScore = Button(self, text="Calculate", font=self.calculateFont, command=self.Calculate, bg="green")  # Calculate button
        self.calculateClassScore.grid(row=16, column=15, rowspan=4, pady=(25, 15))

        directionsButton = Button(self, text="Directions", command=self.directionsPopUp, bg="grey")     # Button to open up directions popup
        directionsButton.grid(row=0, column=15, rowspan=2)

        quitButton = Button(self, text="Quit", command=sys.exit, bg="red")      # Button to quit the grade calculator. Terminates all processes
        quitButton.grid(row=2, column=15, rowspan=2, pady=(0, 25))


    def directionsPopUp(self):      # Function that creates a directions popup for the user to read and follow
        popUp = Toplevel()
        popUp.title("Directions")
        popUp.attributes('-topmost', 1)     # Places the popup window on top of the grade calculator window
        directions = Message(popUp, text="Welcome to the Grade Calculator \n"
                                         "1. Edit the grade scale first \n"
                                         "2. Enter the weights for each section \n"
                                         "After you add a section, please enter the score right away \n"
                                         "(Only the last score can be edited) \n"
                                         "Press calculate to update averages for each section and the class score",
                             font=self.directionsFont)
        directions.pack()
        dismiss = Button(popUp, text="OK", command=popUp.destroy)   # OK button closes the popup
        dismiss.pack()
        popUp.geometry("400x200")

    def CreateGradeScale(self):     # A function that creates a grade scale, customizable to the user

        Label(self, text='Grade').grid(row=4, column=14)
        Label(self, text="A").grid(row=5, column=14)
        Label(self, text="A-").grid(row=6, column=14)
        Label(self, text="B+").grid(row=7, column=14)
        Label(self, text="B").grid(row=8, column=14)
        Label(self, text="B-").grid(row=9, column=14)
        Label(self, text="C+").grid(row=10, column=14)
        Label(self, text="C").grid(row=11, column=14)
        Label(self, text="C-").grid(row=12, column=14)
        Label(self, text="D+").grid(row=13, column=14)
        Label(self, text="D").grid(row=14, column=14)

        Label(self, text="Percent").grid(row=4, column=15)

        a_value = Entry(self)           # The following lines are entry boxes for their respective letter grades
        a_value.grid(row=5, column=15)
        a_value.insert(0, 93)           # Each is given a default value that can changed

        a_minus_value = Entry(self)
        a_minus_value.grid(row=6, column=15)
        a_minus_value.insert(0, 90)

        b_plus_value = Entry(self)
        b_plus_value.grid(row=7, column=15)
        b_plus_value.insert(0, 87)

        b_value = Entry(self)
        b_value.grid(row=8, column=15)
        b_value.insert(0, 83)

        b_minus_value = Entry(self)
        b_minus_value.grid(row=9, column=15)
        b_minus_value.insert(0, 80)

        c_plus_value = Entry(self)
        c_plus_value.grid(row=10, column=15)
        c_plus_value.insert(0, 77)

        c_value = Entry(self)
        c_value.grid(row=11, column=15)
        c_value.insert(0, 73)

        c_minus_value = Entry(self)
        c_minus_value.grid(row=12, column=15)
        c_minus_value.insert(0, 70)

        d_plus_value = Entry(self)
        d_plus_value.grid(row=13, column=15)
        d_plus_value.insert(0, 67)

        d_value = Entry(self)
        d_value.grid(row=14, column=15)
        d_value.insert(0, 63)

        grade_scale = [float(a_value.get()), float(a_minus_value.get()), float(b_plus_value.get()),
                       float(b_value.get()),
                       float(b_minus_value.get()), float(c_plus_value.get()), float(c_value.get()),
                       float(c_minus_value.get()),
                       float(d_plus_value.get()), float(d_value.get())]
        return grade_scale          # The grade scale and the values are added to a list and that list is returned so they can be accessed by later functions


    def getGrade(self, fp, gs):     # A function that determines the letter grade according to the final percent and the grade scale
        if fp >= gs[0]:
            return 'A'
        elif fp >= gs[1]:
            return 'A-'
        elif fp >= gs[2]:
            return 'B+'
        elif fp >= gs[3]:
            return 'B'
        elif fp >= gs[4]:
            return 'B-'
        elif fp >= gs[5]:
            return 'C+'
        elif fp >= gs[6]:
            return 'C'
        elif fp >= gs[7]:
            return 'C-'
        elif fp >= gs[8]:
            return 'D+'
        elif fp >= gs[9]:
            return 'D'
        else:
            return 'F'


                                # *** All add functions are the same, but with different labels. They all work in the same way ***
    def addExam(self):          # A function that adds an exam to the grade calculator

        if len(self.examList) != 0:     # If there is an exam in the list already, the previous grade is stored.
            previousGrade = float(self.examGrade.get())     # This is so a user can change a grade and the new score is recorded
        examName = Entry(self)      # The user is able to change the name of the exam.
        examName.grid(row=self.examNumber + 3, column=0)
        examName.insert(0, "Exam " + str(self.examNumber))      # By default, each exam is named exam + the exam number
        self.examGrade = Entry(self)        # Entry box for the exam grade
        self.examGrade.grid(row=self.examNumber + 3, column=1)
        self.examGrade.insert(0, 0)         # The default grade for each exam is 0

        if len(self.examList) == 0:         # If there haven't been any exams recorded, the grade just entered is added
            self.examList.append(float(self.examGrade.get()))
        else:
            self.examList.append(float(previousGrade))      # If there are exams already, the previous grade is added. Again, so the user can edit

        sum = 0
        for i in range(len(self.examList)):     # A for loop that goes through the list of exams and updates the exam average. Doesn't include newest exam that is 0
            sum += self.examList[i]
        if len(self.examList) != 0:
            newAvg = sum / len(self.examList)
        else:
            newAvg = 0      # If there is only 1 exam, the average is 0 because the new score hasn't been added to the list yet

        self.something = newAvg     # Variable needed to store the averages as they update

        examAvg = Label(self, text=self.something)      # Displays the new exam average
        Label(self, text="Exam Average").grid(row=self.examNumber + 4, column=0)    # Shows the exam average so far
        examAvg.grid(row=self.examNumber + 4, column=1)

        self.examNumber += 1        # The exam number is incremented


    def addAssignment(self):

        if len(self.assignmentList) != 0:
            previousGrade = float(self.assignmentGrade.get())
        assignmentName = Entry(self)
        assignmentName.grid(row=self.assignmentNumber + 3, column=4)
        assignmentName.insert(0, "Assignment " + str(self.assignmentNumber))
        self.assignmentGrade = Entry(self)
        self.assignmentGrade.grid(row=self.assignmentNumber + 3, column=5)
        self.assignmentGrade.insert(0, 0)

        if len(self.assignmentList) == 0:
            self.assignmentList.append(float(self.assignmentGrade.get()))
        else:
            self.assignmentList.append(float(previousGrade))

        sum = 0
        for i in range(len(self.assignmentList)):
            sum += self.assignmentList[i]
        if len(self.assignmentList) != 0:
            newAvg = sum / len(self.assignmentList)
        else:
            newAvg = 0

        self.something = newAvg

        assignmentAvg = Label(self, text=self.something)
        assignmentAvg.grid(row=self.assignmentNumber + 4, column=5)
        Label(self, text="Assignment Average").grid(row=self.assignmentNumber + 4, column=4)

        self.assignmentNumber += 1


    def addLab(self):

        if len(self.labList) != 0:
            previousGrade = float(self.labGrade.get())
        labName = Entry(self)
        labName.grid(row=self.labNumber + 3, column=8)
        labName.insert(0, "Lab " + str(self.labNumber))
        self.labGrade = Entry(self)
        self.labGrade.grid(row=self.labNumber + 3, column=9)
        self.labGrade.insert(0, 0)

        if len(self.labList) == 0:
            self.labList.append(float(self.labGrade.get()))
        else:
            self.labList.append(float(previousGrade))

        sum = 0
        for i in range(len(self.labList)):
            sum += self.labList[i]
        if len(self.labList) != 0:
            newAvg = sum / len(self.labList)
        else:
            newAvg = 0

        self.something = newAvg

        labAvg = Label(self, text=self.something)
        Label(self, text="Lab Average").grid(row=self.labNumber + 4, column=8)
        labAvg.grid(row=self.labNumber + 4, column=9)

        self.labNumber += 1


    def addQuiz(self):

        if len(self.quizList) != 0:
            previousGrade = float(self.quizGrade.get())
        quizName = Entry(self)
        quizName.grid(row=self.quizNumber + 22, column=0)
        quizName.insert(0, "Quiz " + str(self.quizNumber))
        self.quizGrade = Entry(self)
        self.quizGrade.grid(row=self.quizNumber + 22, column=1)
        self.quizGrade.insert(0, 0)

        if len(self.quizList) == 0:
            self.quizList.append(float(self.quizGrade.get()))
        else:
            self.quizList.append(float(previousGrade))

        sum = 0
        for i in range(len(self.quizList)):
            sum += self.quizList[i]
        if len(self.quizList) != 0:
            newAvg = sum / len(self.quizList)
        else:
            newAvg = 0

        self.something = newAvg

        quizAvg = Label(self, text=self.something)
        Label(self, text="Quiz Average").grid(row=self.quizNumber + 23, column=0)
        quizAvg.grid(row=self.quizNumber + 23, column=1)

        self.quizNumber += 1


    def addFinalExam(self):

        if len(self.finalExamList) != 0:
            previousGrade = float(self.finalExamGrade.get())
        finalExamName = Entry(self)
        finalExamName.grid(row=self.finalExamNumber + 22, column=4)
        finalExamName.insert(0, "Final Exam")
        self.finalExamGrade = Entry(self)
        self.finalExamGrade.grid(row=self.finalExamNumber + 22, column=5)
        self.finalExamGrade.insert(0, 0)

        if len(self.finalExamList) == 0:
            self.finalExamList.append(float(self.finalExamGrade.get()))
        else:
            self.finalExamList.append(float(previousGrade))

        sum = 0
        for i in range(len(self.finalExamList)):
            sum += self.finalExamList[i]
        if len(self.finalExamList) != 0:
            newAvg = sum / len(self.finalExamList)
        else:
            newAvg = 0

        self.something = newAvg

        finalExamAvg = Label(self, text=self.something)
        finalExamAvg.grid(row=self.finalExamNumber + 23, column=5)
        Label(self, text="Final Exam Average").grid(row=self.finalExamNumber + 23, column=4)

        self.finalExamNumber += 1


    def addEssay(self):

        if len(self.essayList) != 0:
            previousGrade = float(self.essayGrade.get())
        essayName = Entry(self)
        essayName.grid(row=self.essayNumber + 22, column=8)
        essayName.insert(0, "Essay " + str(self.essayNumber))
        self.essayGrade = Entry(self)
        self.essayGrade.grid(row=self.essayNumber + 22, column=9)
        self.essayGrade.insert(0, 0)

        if len(self.essayList) == 0:
            self.essayList.append(float(self.essayGrade.get()))
        else:
            self.essayList.append(float(previousGrade))

        sum = 0
        for i in range(len(self.essayList)):
            sum += self.essayList[i]
        if len(self.essayList) != 0:
            newAvg = sum / len(self.essayList)
        else:
            newAvg = 0

        self.something = newAvg

        essayAvg = Label(self, text=self.something)
        Label(self, text="Essay Average").grid(row=self.essayNumber + 23, column=8)
        essayAvg.grid(row=self.essayNumber + 23, column=9)

        self.essayNumber += 1




                                    # *** All calculate functions are the exact same, just with different names for different sections ***
    def calculateExams(self):       # A function used by the Calculate function to calculate the exam average. Updates without adding a new exam

        if len(self.examList) != 0:     # If the exam list has an exam in it, the previous grade is recorded. This is necessary because it hasn't been stored yet
            previousGrade = float(self.examGrade.get())
            self.examList[self.examNumber - 2] = previousGrade      # The previous exam score is added to the end of the list, replaces the default 0
        else:
            self.examList.append(float(self.examGrade.get()))       # If there is nothing else in the exam list, the grade is added

        sum = 0
        for i in range(len(self.examList)):     # A for list that calculates the exam sum
            sum += self.examList[i]
        if len(self.examList) != 0:
            if len(self.examList) == 1:     # If there is only 1 exam, that is the sum
                newAvg = self.examList[0]
            else:
                newAvg = sum / (len(self.examList))     # If there is more than 1 exam, the sum is divided by that number
        else:
            newAvg = 0      # If there are no exams, the exam average is 0

        self.something = newAvg     # A variable needed to store the updating exam average
        examAvg = Label(self, text=self.something)      # Updates the exam average label
        examAvg.grid(row=self.examNumber + 3, column=1)
        Label(self, text="Exam Average").grid(row=self.examNumber + 3, column=0)
        return newAvg       # The new average is returned so it can be used by other functions


    def calculateAssignments(self):

        if len(self.assignmentList) != 0:
            previousGrade = float(self.assignmentGrade.get())
            self.assignmentList[self.assignmentNumber - 2] = previousGrade
        else:
            self.assignmentList.append(float(self.assignmentGrade.get()))

        sum = 0
        for i in range(len(self.assignmentList)):
            sum += self.assignmentList[i]
        if len(self.assignmentList) != 0:
            if len(self.assignmentList) == 1:
                newAvg = self.assignmentList[0]
            else:
                newAvg = sum / (len(self.assignmentList))
        else:
            newAvg = 0

        self.something = newAvg
        assignmentAvg = Label(self, text=self.something)
        Label(self, text="Assignment Average").grid(row=self.assignmentNumber + 3, column=4)
        assignmentAvg.grid(row=self.assignmentNumber + 3, column=5)

        return newAvg


    def calculateLabs(self):

        if len(self.labList) != 0:
            previousGrade = float(self.labGrade.get())
            self.labList[self.labNumber - 2] = previousGrade
        else:
            self.labList.append(float(self.labGrade.get()))

        sum = 0
        for i in range(len(self.labList)):
            sum += self.labList[i]
        if len(self.labList) != 0:
            if len(self.labList) == 1:
                newAvg = self.labList[0]
            else:
                newAvg = sum / (len(self.labList))
        else:
            newAvg = 0

        self.something = newAvg
        labAvg = Label(self, text=self.something)
        labAvg.grid(row=self.labNumber + 3, column=9)
        Label(self, text="Lab Average").grid(row=self.labNumber + 3, column=8)
        return newAvg


    def calculateEssays(self):

        if len(self.essayList) != 0:
            previousGrade = float(self.essayGrade.get())
            self.essayList[self.essayNumber - 2] = previousGrade
        else:
            self.essayList.append(float(self.essayGrade.get()))

        sum = 0
        for i in range(len(self.essayList)):
            sum += self.essayList[i]
        if len(self.essayList) != 0:
            if len(self.essayList) == 1:
                newAvg = self.essayList[0]
            else:
                newAvg = sum / (len(self.essayList))
        else:
            newAvg = 0

        self.something = newAvg
        essayAvg = Label(self, text=self.something)
        essayAvg.grid(row=self.essayNumber + 22, column=9)
        Label(self, text="Essay Average").grid(row=self.essayNumber + 22, column=8)
        return newAvg


    def calculateQuizzes(self):

        if len(self.quizList) != 0:
            previousGrade = float(self.quizGrade.get())
            self.quizList[self.quizNumber - 2] = previousGrade
        else:
            self.quizList.append(float(self.quizGrade.get()))

        sum = 0
        for i in range(len(self.quizList)):
            sum += self.quizList[i]
        if len(self.quizList) != 0:
            if len(self.quizList) == 1:
                newAvg = self.quizList[0]
            else:
                newAvg = sum / (len(self.quizList))
        else:
            newAvg = 0

        self.something = newAvg
        quizAvg = Label(self, text=self.something)
        quizAvg.grid(row=self.quizNumber + 22, column=1)
        Label(self, text="Quiz Average").grid(row=self.quizNumber + 22, column=0)
        return newAvg


    def calculateFinalExam(self):

        if len(self.finalExamList) != 0:
            previousGrade = float(self.finalExamGrade.get())
            self.finalExamList[self.finalExamNumber - 2] = previousGrade
        else:
            self.finalExamList.append(float(self.finalExamGrade.get()))

        sum = 0
        for i in range(len(self.finalExamList)):
            sum += self.finalExamList[i]
        if len(self.finalExamList) != 0:
            if len(self.finalExamList) == 1:
                newAvg = self.finalExamList[0]
            else:
                newAvg = sum / (len(self.finalExamList))
        else:
            newAvg = 0

        self.something = newAvg
        finalExamAvg = Label(self, text=self.something)
        Label(self, text="Final Exam Average").grid(row=self.finalExamNumber + 22, column=4)
        finalExamAvg.grid(row=self.finalExamNumber + 22, column=5)

        return newAvg


    def Calculate(self):        # A function that calls of the calculate functions and finds the final grade of the class
        examAverage = 0
        try:
            examAverage = self.calculateExams()     # If there are no exams, an attribute error will appear. Same for the rest of the sections
        except AttributeError:                      # If this happens, the exam average is recorded as 0
            nothing = 0

        assignmentAverage = 0
        try:
            assignmentAverage = self.calculateAssignments()
        except AttributeError:
            nothing = 0

        labAverage = 0
        try:
            labAverage = self.calculateLabs()
        except AttributeError:
            nothing = 0

        quizAverage = 0
        try:
            quizAverage = self.calculateQuizzes()
        except AttributeError:
            nothing = 0

        finalExamAverage = 0
        try:
            finalExamAverage = self.calculateFinalExam()
        except AttributeError:
            nothing = 0

        essayAverage = 0
        try:
            essayAverage = self.calculateEssays()
        except AttributeError:
            nothing = 0

        officialGrade = (examAverage * ((int(self.examWeight.get()))) + assignmentAverage * (
        (int(self.assignmentWeight.get())))
                         + labAverage * ((int(self.labWeight.get()))) + quizAverage * ((int(self.quizWeight.get()))) +
                         finalExamAverage * ((int(self.finalExamWeight.get()))) + essayAverage * (
                         (int(self.essayWeight.get())))) / 100      # The final grade is calculated using the section weights and averages

        officialGradeLabel = Label(self, text=officialGrade, font=self.finalFont)       # A label that shows the final percent
        officialGradeLabel.grid(row=21, column=15, rowspan = 2)

        gradeLetter = Label(self, text=self.getGrade(officialGrade, self.gradeScale), font=self.finalLetterFont)  # A label that shows the final letter grade
        gradeLetter.grid(row=23, column=15, rowspan = 4)  # Get this to update just like scores



def main():         # Main function

    root = Tk()     # Creates an instance of the tkinter object

    app = GradeCalc(root)   # Creates an instance of the grade calculator class, inheriting the tkinter object as a paramter
    app.title("Grade Calculator")   # Names the window
    root.withdraw()         # Needed to ignore the original root window

    app.state('zoomed')     # Maximizes the grade calculator window
    root.mainloop()         # Runs the loop



if __name__ == '__main__':  # A call to the main function
    main()