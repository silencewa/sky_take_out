package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工方法。
     *
     * @param employeeDTO 员工数据传输对象，包含员工的详细信息。
     *                    该参数用于将员工信息传递给此方法以进行保存。
     * @return 无返回值，直接保存员工信息至数据库或其他存储介质。
     */
    void save(EmployeeDTO employeeDTO);
}
