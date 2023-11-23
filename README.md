This API provides CRUD operations for managing teachers and students in a college.
Teacher Endpoints
1. Get All Teachers
Method: GET
Endpoint: /api/teachers
Description: Get a list of all teachers.
2. Get Teacher by ID
Method: GET
Endpoint: /api/teachers/{teacher_id}
Description: Get details of a specific teacher by ID.
3. Create a New Teacher
Method: POST
Endpoint: /api/teachers
Description: Create a new teacher.
Request Body:
{
  "name": "John Doe",
  "subject": "Math"
}
Response: Returns the created teacher.
4. Update a Teacher
Method: PUT
Endpoint: /api/teachers/{teacher_id}
Description: Update details of a specific teacher by ID.
Request Body:
{
  "name": "Updated Name",
  "subject": "Updated Subject"
}
Response: Returns the updated teacher.
5. Delete a Teacher
Method: DELETE
Endpoint: /api/teachers/{teacher_id}
Description: Delete a teacher by ID.
Student Endpoints
1. Get All Students
Method: GET
Endpoint: /api/students
Description: Get a list of all students.
2. Get Student by ID
Method: GET
Endpoint: /api/students/{student_id}
Description: Get details of a specific student by ID.
3. Create a New Student
Method: POST
Endpoint: /api/students
Description: Create a new student.
Request Body:
{
  "name": "Jane Doe",
  "department": "Computer Science"
}
Response: Returns the created student.
4. Update a Student
Method: PUT
Endpoint: /api/students/{student_id}
Description: Update details of a specific student by ID.
Request Body:
{
  "name": "Updated Name",
  "department": "Updated Department"
}
Response: Returns the updated student.
5. Delete a Student
Method: DELETE
Endpoint: /api/students/{student_id}
Description: Delete a student by ID.
