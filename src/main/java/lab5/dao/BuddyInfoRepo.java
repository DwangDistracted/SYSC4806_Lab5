package lab5.dao;

import lab5.model.BuddyInfo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByBuddyName(String buddyName);
    List<BuddyInfo> findByAddress(String address);
    BuddyInfo findById(long id);
}
