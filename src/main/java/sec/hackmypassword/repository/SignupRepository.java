/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec.hackmypassword.repository;

/**
 *
 * @author NachiketTapas
 */
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sec.hackmypassword.domain.Signup;

public interface SignupRepository extends JpaRepository<Signup, Long> {
   
}
