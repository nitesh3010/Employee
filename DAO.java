package learnCode;

import java.sql.SQLException;
import java.util.List;

public interface DAO<Employee> {
	Employee get(int Id) throws SQLException;
	List<Employee> getAll() throws SQLException;
	int save(Employee employee) throws SQLException;
	int insert(Employee employee) throws SQLException;
	int update(Employee employee) throws SQLException;
	int delete(Employee employee) throws SQLException;
}
