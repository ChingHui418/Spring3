package tw.hui.spring3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.hui.spring3.entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Long> {
	
}
