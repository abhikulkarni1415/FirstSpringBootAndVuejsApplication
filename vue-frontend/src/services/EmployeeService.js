import axios from 'axios'

const Employee_API_BASE_URL = 'http://localhost:8080/api/employees'

class EmployeeService{
    getEmployees(){
        return axios.get(Employee_API_BASE_URL);
    }
}

export default new EmployeeService()