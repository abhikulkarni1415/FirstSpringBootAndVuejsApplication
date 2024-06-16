

package net.JavaVuejs.springboot_backened.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
	
	@Column(name = "first_name",nullable = false )
  private String firstName;
	
	@Column(name = "last_name")
  private String lastName;
  private String email;
  
  // Default constructor required by JPA
  public Employee() {
  }
  
  private Employee(EmployeeBuilder builder) {
      this.firstName = builder.firstName;
      this.lastName = builder.lastName;
      this.email = builder.email;
  }

  // Getters
  
  public String getFirstName() {
      return firstName;
  }

  public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getLastName() {
      return lastName;
  }

  public String getEmail() {
      return email;
  }

  // Static nested Builder class
  public static class EmployeeBuilder {
      private String firstName;
      private String lastName;
      private String email;

      public EmployeeBuilder setFirstName(String firstName) {
          this.firstName = firstName;
          return this;
      }

      public EmployeeBuilder setLastName(String lastName) {
          this.lastName = lastName;
          return this;
      }

      public EmployeeBuilder setEmail(String email) {
          this.email = email;
          return this;
      }

      public Employee build() {
          return new Employee(this);
      }
  }
	

}

