package com.folksdev.account.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.util.Arrays

@Entity

data class Customer(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id : String? = "",
        val name : String?,
        val surname:String?,

        @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
        val account: Set<Account>?
){

    constructor(name: String, surname: String) : this("", name, surname, HashSet())
}
