package com.lasercode.awsimageupload.datastore;/*
 * Created By Arjun Gautam .
 * Date : 11/12/20
 * Time : 8:32 PM
 */

import com.lasercode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d57bae24-f291-4547-98c1-07073d338415"), "Arjun Gautam", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("60f741a1-342e-43db-a7a6-b5ff524bc482"), "Pooja Poudel", null));

    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }


}
