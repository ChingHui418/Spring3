package tw.hui.spring3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.hui.spring3.entity.Member;

public interface MemberRepo extends JpaRepository<Member, Long>{
	/*
	 *  動詞 + (介係詞)(By) + 屬性名稱
	 *  findByEmail(String email) => optional<Member> / Member
	 *  findByAge(Integer age) => List<Member>  
	 *  
	 *  countByAge(Integer age) => Long
	 *  deleteByAge(Integer age)
	 *  
	 *  And/Or
	 *  findByNameAndAge(String name, Integer age)
	 *  findByNameOrAge(String name, Integer age)
	 *  
	 *  Between/LessThan/GreateThanEqual
	 *  findByAgeBetween(Integer min, Integer max)
	 *  findByOrderDateBetween(Date/LocalDate start, Date/LocalDate end)
	 *  
	 *  IsNull/IsNotNull
	 *  
	 *  
	 *  OrderBy + 屬性名稱 + Asc/Desc
	 *  findByLastNameOrderByFirstNameAscAndTitleDesc(String lastname)
	 *  
	 */
	
	

}
