package com.chris.hash_test;

import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * Created by ye830 on 8/3/2020.
 */
public class RelationshipHash {
    public static String generateUUID(String relation) {
        if (StringUtils.isBlank(relation)) {
            return StringUtils.EMPTY;
        }
        UUID uuid = UUID.nameUUIDFromBytes(relation.getBytes(StandardCharsets.UTF_8));
        return uuid.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateUUID("1447_2507349"));
    }


/*
         relation hash key generation rule:
                   https://confluence.zhihuiya.com/pages/viewpage.action?pageId=100920064
         * HASH (str( drug_id ) + str( disease_id ) )
         * HASH (str( drug_id ) + str( target_id ) )
         * HASH (str( target_id ) + str( disease_id ) )

         * HASH (str( drug_id ) + str( organization_id ) )
         * HASH (str( disease_id ) + str( organization_id ) )
         * HASH (str( target_id ) + str( organization_id ) )

          note: the order to generate hash key is important if use batchLoad to get all relation
                for current paper
         */
}
