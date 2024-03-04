# TeachMeSkills_C27_Lesson_17_HW

## Homework for lesson #17

### 1. **Task #1**

App implements next logic:  
    - if user enter 1: app prints string in reverse order;
    - if user enter 2: app prints factorial value;
    - if user enter any other operation number, app prints error message.

App contains:
- **"CustomInterface"** - functional interface contains `T customMethod(T obj)` custom method;  
- **"UserRequestService"** contains `getOperationNumber(Scanner scanner)`, `handleOperation1()` and `handleOperation2()`  
methods;
- **"Runner"** get operation number from user (`getOperationNumber(Scanner scanner)` method) and call required  
operation: `handleOperation1()` or `handleOperation2()` from **"UserRequestService"**  class.   
Both methods handle task conditions.

---

### 2. **Task #2**

App allows user to enter date in `dd/MM/yyyy` format and provides the day of the week for entered date.

App contains:
- **"Constants"** interface contains default date pattern: `dd/MM/yyyy`;
- **"DateService"** class contains `getDayOfWeekByDate(String date)` method and prints day of the week;
- **"Runner"** class gets date from user and calls `getDayOfWeekByDate(String date)` method.