/**
 * 
 */
package com.ntl.topjobs.seekersignuplogin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.seekersignuplogin.bean.SeekerSignup;

/**
 * @author Training
 *
 */
@Repository
public interface SignUpDao extends JpaRepository<SeekerSignup, String> {

}
