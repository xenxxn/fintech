package com.zerobase.api.loan.request

interface LoanRequestService {
    fun loanRequestMain(
            loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): LoanRequestDto.LoanRequestResponseDto

    fun saveUserInfo(loanRequestInputDto: LoanRequestDto.LoanRequestInputDto)

    fun loanRequestReview(userKey : String)
}